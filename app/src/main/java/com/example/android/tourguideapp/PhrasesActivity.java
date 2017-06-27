package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static android.media.AudioManager.AUDIOFOCUS_LOSS;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK;

/**
 * Created by Niamh on 24/06/2017.
 */

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private AudioManager am;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0); //restarts audio file when reopened
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        phrases.add(new Phrase(getString(R.string.thanks_english),getString(R.string.thanks_irish), R.raw.thanks));
        phrases.add(new Phrase(getString(R.string.hello_english), getString(R.string.hello_irish), R.raw.hello));
        phrases.add(new Phrase(getString(R.string.how_english),getString(R.string.how_irish) , R.raw.howareyou));
        phrases.add(new Phrase(getString(R.string.response_english), getString(R.string.response_irish), R.raw.response));
        phrases.add(new Phrase(getString(R.string.what_name_english), getString(R.string.what_name_irish), R.raw.what_is_your_name));
        phrases.add(new Phrase(getString(R.string.name_english),getString(R.string.name_irish) , R.raw.mynameis));
        phrases.add(new Phrase(getString(R.string.goodbye_english), getString(R.string.goodbye_irish), R.raw.goodbye));
        phrases.add(new Phrase(getString(R.string.cheers_english), getString(R.string.cheers_irish), R.raw.cheers));
        phrases.add(new Phrase(getString(R.string.safe_english), getString(R.string.safe_irish), R.raw.safe_home));


        PhraseWordAdaptor adaptor = new PhraseWordAdaptor(this, phrases, R.color.primary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phrase phrase = phrases.get(position);
                releaseMediaPlayer();
                int result = am.requestAudioFocus(mOnAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, phrase.getAudioResource());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(mCompletitionListener);
                }

            }
        });
    }

    private MediaPlayer.OnCompletionListener mCompletitionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mP) {
            releaseMediaPlayer();
        }
    };

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
            // Abandon audio focus when playback complete
            am.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}