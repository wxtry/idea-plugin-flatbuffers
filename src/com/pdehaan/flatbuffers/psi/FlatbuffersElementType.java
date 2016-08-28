package com.pdehaan.flatbuffers.psi;

import com.intellij.psi.tree.IElementType;
import com.pdehaan.flatbuffers.FlatbuffersLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersElementType extends IElementType
{
    public FlatbuffersElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, FlatbuffersLanguage.INSTANCE);
    }
}
