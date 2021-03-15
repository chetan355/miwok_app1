package com.example.miwokapp;
public class Word {
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private static final int NO_IMAGE_ID = -1;
    private int mMiwokImgaesId = NO_IMAGE_ID;
    private int song_id;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int song) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        song_id = song;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageid,int song)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokImgaesId = imageid;
        song_id = song;

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

    public int getImageResourceId(){return mMiwokImgaesId;}

    public boolean hasImage()
    {
        return mMiwokImgaesId != NO_IMAGE_ID;
    }

    public int getDefaultMedia()
    {
        return song_id;
    }
}
