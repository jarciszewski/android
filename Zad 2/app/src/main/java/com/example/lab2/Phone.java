package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.OnConflictStrategy;
import androidx.room.PrimaryKey;

@Entity (tableName = "smartphones")
public class Phone {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_phone")
    protected long mId;

    @NonNull
    @ColumnInfo(name = "OEM")
    protected String mOEM;

    @NonNull
    @ColumnInfo(name = "model")
    protected String mModel;

    @NonNull
    @ColumnInfo(name = "version")
    protected String mVersion;

    @NonNull
    @ColumnInfo(name = "website")
    protected String mWebsite;

    public Phone(@NonNull String mOEM, @NonNull String mModel, @NonNull String mVersion, @NonNull String mWebsite) {
        this.mOEM = mOEM;
        this.mModel = mModel;
        this.mVersion = mVersion;
        this.mWebsite = mWebsite;
    }

    @Ignore
    public Phone(@NonNull String mOEM, @NonNull String mModel, @NonNull String mVersion, @NonNull String mWebsite, @NonNull long id) {
        this.mOEM = mOEM;
        this.mModel = mModel;
        this.mVersion = mVersion;
        this.mWebsite = mWebsite;
        this.mId = id;
    }



    public long getFie_mId() {
        return mId;
    }

    public void setFie_mId(long mId) {
        this.mId = mId;
    }

    @NonNull
    public String getmOEM() {
        return mOEM;
    }

    public void setmOEM(@NonNull String mOEM) {
        this.mOEM = mOEM;
    }

    @NonNull
    public String getmModel() {
        return mModel;
    }

    public void setmModel(@NonNull String mModel) {
        this.mModel = mModel;
    }

    @NonNull
    public String getmVersion() {
        return mVersion;
    }

    public void setmVersion(@NonNull String mVersion) {
        this.mVersion = mVersion;
    }

    @NonNull
    public String getmWebsite() {
        return mWebsite;
    }

    public void setWebsite(@NonNull String mWebsite) {
        this.mWebsite = mWebsite;
    }


}
