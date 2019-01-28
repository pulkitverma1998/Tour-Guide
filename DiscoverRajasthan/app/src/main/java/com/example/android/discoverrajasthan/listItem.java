package com.example.android.discoverrajasthan;

public class listItem {

    private int mNameOfAttraction;
    private int mDescriptionOfAttraction;
    private int mImageResourceId;
    private int mBodyParagraphId = NO_PARAGRAPH_PROVIDED;
    private static final int NO_PARAGRAPH_PROVIDED = -1;

    public listItem(int imageResourceId, int nameOfAttraction, int descriptionOfAttraction) {
        mNameOfAttraction = nameOfAttraction;
        mDescriptionOfAttraction = descriptionOfAttraction;
        mImageResourceId = imageResourceId;
    }

    public listItem(int imageResourceId, int nameOfAttraction, int descriptionOfAttraction, int bodyParagraphId) {
        mNameOfAttraction = nameOfAttraction;
        mDescriptionOfAttraction = descriptionOfAttraction;
        mImageResourceId = imageResourceId;
        mBodyParagraphId = bodyParagraphId;
    }

    public int getNameOfAttraction() {
        return mNameOfAttraction;
    }

    public int getDescriptionOfAttraction() {
        return mDescriptionOfAttraction;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getBodyParagraphId() {
        return mBodyParagraphId;
    }

    public boolean hasParagraph() {
        return mBodyParagraphId != NO_PARAGRAPH_PROVIDED;
    }

}
