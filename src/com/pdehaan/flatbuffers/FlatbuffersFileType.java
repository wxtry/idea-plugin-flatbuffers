package com.pdehaan.flatbuffers;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersFileType extends LanguageFileType
{
    public static final FlatbuffersFileType INSTANCE = new FlatbuffersFileType();

    private FlatbuffersFileType()
    {
        super(FlatbuffersLanguage.INSTANCE);
    }

    @NotNull @Override public String getName()
    {
        return "Flatbuffers file";
    }

    @NotNull @Override public String getDescription()
    {
        return "Flatbuffers IDL file";
    }

    @NotNull @Override public String getDefaultExtension()
    {
        return "fbs";
    }

    @Nullable @Override public Icon getIcon()
    {
        return null;
    }
}
