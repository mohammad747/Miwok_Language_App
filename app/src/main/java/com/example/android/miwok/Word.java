package com.example.android.miwok;

import android.content.Context;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /**recource id for the images*/
    private int mImagrRecourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     *                         @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create the second word object
     *
     * @param imageRecourceId is the recource id of the image
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(int imageRecourceId,String defaultTranslation, String miwokTranslation,int audioResourceId){
        mImagrRecourceId = imageRecourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * get the image recource id
     */
    public int getmImagrRecourceId() {
        return mImagrRecourceId;
    }

    /**
     * Return whether or not there is an image or this word
     * @return
     */
    public boolean hasImage(){
        return mImagrRecourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImagrRecourceId=" + mImagrRecourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}