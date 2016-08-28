package com.pdehaan.flatbuffers;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersFile extends PsiFileBase
{
    protected FlatbuffersFile(@NotNull FileViewProvider fileViewProvider)
    {
        super(fileViewProvider, FlatbuffersLanguage.INSTANCE);
    }

    @NotNull @Override public FileType getFileType()
    {
        return FlatbuffersFileType.INSTANCE;
    }
}
