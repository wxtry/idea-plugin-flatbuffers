package com.pdehaan.flatbuffers;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.pdehaan.flatbuffers.psi.FlatbuffersTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Created by pdehaan on 8/27/16.
 */
public class FlatbuffersSyntaxHighligher extends SyntaxHighlighterBase
{
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static
    {
        fillMap(ATTRIBUTES, createTextAttributesKey("FB_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT),
            FlatbuffersTypes.COMMENT
        );

        fillMap(ATTRIBUTES, createTextAttributesKey("FB_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD),
            FlatbuffersTypes.INCLUDE,
            FlatbuffersTypes.NAMESPACE,
            FlatbuffersTypes.TABLE,
            FlatbuffersTypes.STRUCT,
            FlatbuffersTypes.UNION,
            FlatbuffersTypes.ENUM,
            FlatbuffersTypes.ATTRIBUTE,
            FlatbuffersTypes.ROOT_TYPE,
            // built-in types
            FlatbuffersTypes.BOOL,
            FlatbuffersTypes.BYTE,
            FlatbuffersTypes.UBYTE,
            FlatbuffersTypes.SHORT,
            FlatbuffersTypes.USHORT,
            FlatbuffersTypes.INT,
            FlatbuffersTypes.UINT,
            FlatbuffersTypes.LONG,
            FlatbuffersTypes.ULONG,
            FlatbuffersTypes.FLOAT,
            FlatbuffersTypes.DOUBLE,
            FlatbuffersTypes.STRING
        );

        fillMap(ATTRIBUTES, createTextAttributesKey("FB_STRING_LITERAL", DefaultLanguageHighlighterColors.STRING),
            FlatbuffersTypes.STRING_LITERAL
        );

        fillMap(ATTRIBUTES, createTextAttributesKey("FB_NUMERIC_LITERAL", DefaultLanguageHighlighterColors.NUMBER),
            FlatbuffersTypes.INTEGER_LITERAL,
            FlatbuffersTypes.FLOAT_LITERAL
        );
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer()
    {
        return new FlatbuffersLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType)
    {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
