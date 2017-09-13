package com.example.zoerebeccakaplan.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private final int TWINKLE_TWINKLE = 500;

    private Button aButton, bButton, bbButton, cButton, csButton, dButton, dsButton, eButton,
            fButton, fsButton, gButton, gsButton, aHighButton, bHighButton, bbHighButton,
            cHighButton, csHighButton, dHighButton, dsHighButton, eHighButton, fHighButton,
            fsHighButton, gHighButton, gsHighButton, mChallenge1, twinkleButton, oldMacButton;
    private MediaPlayer aNote, bNote, bbNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote,
            gNote, gsNote, aHighNote, bHighNote, bbHighNote, cHighNote, csHighNote, dHighNote,
            dsHighNote, eHighNote, fHighNote, fsHighNote, gHighNote, gsHighNote;
    private NumberPicker pickerNumber, pickerNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        setNumberPicker();
        createMediaPlayers();
    }

    //type a comment

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        bbNote = MediaPlayer.create(this, R.raw.scalebb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        aHighNote = MediaPlayer.create(this, R.raw.scalehigha);
        bHighNote = MediaPlayer.create(this, R.raw.scalehighb);
        bbHighNote = MediaPlayer.create(this, R.raw.scalehighbb);
        cHighNote = MediaPlayer.create(this, R.raw.scalehighc);
        csHighNote = MediaPlayer.create(this, R.raw.scalehighcs);
        dHighNote = MediaPlayer.create(this, R.raw.scalehighd);
        dsHighNote = MediaPlayer.create(this, R.raw.scalehighds);
        eHighNote = MediaPlayer.create(this, R.raw.scalehighe);
        fHighNote = MediaPlayer.create(this, R.raw.scalehighf);
        fsHighNote = MediaPlayer.create(this, R.raw.scalehighfs);
        gHighNote = MediaPlayer.create(this, R.raw.scalehighg);
        gsHighNote = MediaPlayer.create(this,R.raw.scalehighgs);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        bbButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        aHighButton.setOnClickListener(this);
        bHighButton.setOnClickListener(this);
        bbHighButton.setOnClickListener(this);
        cHighButton.setOnClickListener(this);
        csHighButton.setOnClickListener(this);
        dHighButton.setOnClickListener(this);
        dsHighButton.setOnClickListener(this);
        eHighButton.setOnClickListener(this);
        fHighButton.setOnClickListener(this);
        fsHighButton.setOnClickListener(this);
        gHighButton.setOnClickListener(this);
        gsHighButton.setOnClickListener(this);
        mChallenge1.setOnClickListener(this);
        twinkleButton.setOnClickListener(this);
        oldMacButton.setOnClickListener(this);
    }

    private void setNumberPicker() {
        pickerNumber.setMinValue(1);
        pickerNumber.setMaxValue(10);

        pickerNote.setMinValue(0);
        pickerNote.setMaxValue(2);
        pickerNote.setDisplayedValues(new String[]{"A", "B", "C", "C#", "D", "D#", "E", "F", "F#",
                "G", "G#"});
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        bButton = (Button) findViewById(R.id.button_b);
        bbButton = (Button) findViewById(R.id.button_bb);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        aHighButton = (Button) findViewById(R.id.button_higha);
        bHighButton = (Button) findViewById(R.id.button_bHigh);
        bbHighButton = (Button) findViewById(R.id.button_highbb);
        cHighButton = (Button) findViewById(R.id.button_highc);
        csHighButton = (Button) findViewById(R.id.button_highcs);
        dHighButton = (Button) findViewById(R.id.button_highd);
        dsHighButton = (Button) findViewById(R.id.button_highds);
        eHighButton = (Button) findViewById(R.id.button_highe);
        fHighButton = (Button) findViewById(R.id.button_highf);
        fsHighButton = (Button) findViewById(R.id.button_highfs);
        gHighButton = (Button) findViewById(R.id.button_highg);
        gsHighButton = (Button) findViewById(R.id.button_highgs);
        mChallenge1 = (Button) findViewById(R.id.button_challenge_one);
        twinkleButton = (Button) findViewById(R.id.button_twinkle);
        oldMacButton = (Button) findViewById(R.id.button_old_mc);

        pickerNumber = (NumberPicker) findViewById(R.id.numberpicker_number);
        pickerNote = (NumberPicker) findViewById(R.id.numberPicker_notes);
    }
    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playNote(MediaPlayer p, int i){
        p.seekTo(0);
        p.start();
        delayPlaying(i);
    }

    private void twinkleTwinkleLittleStar() {
        playNote(cNote, TWINKLE_TWINKLE);
        playNote(cNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(gNote, WHOLE_NOTE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(dNote, TWINKLE_TWINKLE);
        playNote(dNote, TWINKLE_TWINKLE);
        playNote(cNote, WHOLE_NOTE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(dNote, WHOLE_NOTE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(dNote, WHOLE_NOTE);
        playNote(cNote, TWINKLE_TWINKLE);
        playNote(cNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(gNote, WHOLE_NOTE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(fNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(eNote, TWINKLE_TWINKLE);
        playNote(dNote, TWINKLE_TWINKLE);
        playNote(dNote, TWINKLE_TWINKLE);
        playNote(cNote, WHOLE_NOTE);
    }

    private void oldMacdonald(){
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(gNote, WHOLE_NOTE);
        playNote(eHighNote, TWINKLE_TWINKLE);
        playNote(eHighNote, TWINKLE_TWINKLE);
        playNote(dHighNote, TWINKLE_TWINKLE);
        playNote(dHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, WHOLE_NOTE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(aHighNote, TWINKLE_TWINKLE);
        playNote(gNote, WHOLE_NOTE);
        playNote(eHighNote, TWINKLE_TWINKLE);
        playNote(eHighNote, TWINKLE_TWINKLE);
        playNote(dHighNote, TWINKLE_TWINKLE);
        playNote(dHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, WHOLE_NOTE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(gNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, TWINKLE_TWINKLE);
        playNote(cHighNote, WHOLE_NOTE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_bb:
                bbNote.seekTo(0);
                bbNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_higha:
                aHighNote.seekTo(0);
                aHighNote.start();
                break;
            case R.id.button_bHigh:
                bHighNote.seekTo(0);
                bHighNote.start();
                break;
            case R.id.button_highbb:
                bbHighNote.seekTo(0);
                bbHighNote.start();
                break;
            case R.id.button_highc:
                cHighNote.seekTo(0);
                cHighNote.start();
                break;
            case R.id.button_highcs:
                csHighNote.seekTo(0);
                csHighNote.start();
                break;
            case R.id.button_highd:
                dHighNote.seekTo(0);
                dHighNote.start();
                break;
            case R.id.button_highds:
                dsHighNote.seekTo(0);
                dsHighNote.start();
                break;
            case R.id.button_highe:
                eHighNote.seekTo(0);
                eHighNote.start();
                break;
            case R.id.button_highf:
                fHighNote.seekTo(0);
                fHighNote.start();
                break;
            case R.id.button_highfs:
                fsHighNote.seekTo(0);
                fsHighNote.start();
                break;
            case R.id.button_highg:
                gHighNote.seekTo(0);
                gHighNote.start();
                break;
            case R.id.button_highgs:
                gsHighNote.seekTo(0);
                gsHighNote.start();
                break;
            case R.id.button_challenge_one:
                eNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                eNote.start();
                fNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                fNote.start();
                gNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                gNote.start();
                gsNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                gsNote.start();
                aHighNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                aHighNote.start();
                bHighNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                bHighNote.start();
                csHighNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                csHighNote.start();
                dHighNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                dHighNote.start();
                eHighNote.seekTo(0);
                delayPlaying(WHOLE_NOTE);
                eHighNote.start();
                break;
            case R.id.button_twinkle:
                twinkleTwinkleLittleStar();
                break;
            case R.id.button_old_mc:
                oldMacdonald();
                break;

        }
    }
}
