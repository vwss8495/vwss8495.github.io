package com.example.android.miwok;


public class Word {
    /** stores the miwok translation of the default word **/
    private String mMiwokTranslation;

    /** stores the default word **/
    private String mDefaultTranslation;

    /** stores image resource ID **/
    private int mImageResourceID;

    /**
     * create a new word object
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        new Word(defaultTranslation, miwokTranslation, -1);
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceID;
    }
}
