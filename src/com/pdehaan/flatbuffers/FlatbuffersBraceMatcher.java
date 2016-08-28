package com.pdehaan.flatbuffers;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.pdehaan.flatbuffers.psi.FlatbuffersTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pdehaan on 8/28/16.
 */
public class FlatbuffersBraceMatcher implements PairedBraceMatcher
{
    private static final BracePair[] PAIRS = new BracePair[] {
        new BracePair(FlatbuffersTypes.OPEN_PARENTHESIS, FlatbuffersTypes.CLOSE_PARENTHESIS, false),
        new BracePair(FlatbuffersTypes.OPEN_BRACE, FlatbuffersTypes.CLOSE_BRACE, false),
        new BracePair(FlatbuffersTypes.OPEN_BLOCK, FlatbuffersTypes.CLOSE_BLOCK, false)
    };

    @Override
    public BracePair[] getPairs()
    {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(
        @NotNull IElementType iElementType,
        @Nullable IElementType iElementType1
    )
    {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile psiFile, int i)
    {
        return i;
    }
}
