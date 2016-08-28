package com.pdehaan.flatbuffers;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersLexerAdapter extends FlexAdapter
{
    public FlatbuffersLexerAdapter()
    {
        super(new FlatbuffersLexer((Reader) null));
    }
}
