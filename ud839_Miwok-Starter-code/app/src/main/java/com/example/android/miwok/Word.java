package com.example.android.miwok;


public class Word {
    /** stores the miwok translation of the default word **/
    private String mMiwokTranslation;

    /** stores the default word **/
    private String mDefaultTranslation;

    /** stores image resource ID **/
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** static final value used to check if
     * an image resource id was given
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * create a new word object
     *
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
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

    public boolean hasImage() {
            return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
