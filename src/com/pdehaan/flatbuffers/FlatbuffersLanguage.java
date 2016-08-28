package com.pdehaan.flatbuffers;

import com.intellij.lang.Language;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersLanguage extends Language
{
    public static final FlatbuffersLanguage INSTANCE = new FlatbuffersLanguage();

    private FlatbuffersLanguage()
    {
        super("flatbuffers");
    }
}
