package com.dovgopolyy.smartfamily;

import org.androidannotations.annotations.sharedpreferences.DefaultString;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

/**
 * Created by Yevgen Dovgopolyy (basefx) on 11/30/17.
 */

@SharedPref
public interface MyPref {

    @DefaultString(value = "", keyRes = R.string.key_msisdn)
    String msisdn();

    @DefaultString(value = "", keyRes = R.string.super_password)
    String superPassword();
}
