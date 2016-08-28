package com.pdehaan.flatbuffers.psi;

import com.intellij.psi.tree.IElementType;
import com.pdehaan.flatbuffers.FlatbuffersLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersTokenType extends IElementType
{
    public FlatbuffersTokenType(@NotNull @NonNls String debugName)
    {
        super(debugName, FlatbuffersLanguage.INSTANCE);
    }

    @Override
    public String toString()
    {
        return "FlatbuffersTokenType." + super.toString();
    }
}
