// This is a generated file. Not intended for manual editing.
package com.pdehaan.flatbuffers.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.pdehaan.flatbuffers.psi.impl.*;

public interface FlatbuffersTypes {

  IElementType ATTRIBUTE_DECL = new FlatbuffersElementType("ATTRIBUTE_DECL");
  IElementType BUILTIN_TYPE = new FlatbuffersElementType("BUILTIN_TYPE");
  IElementType CUSTOM_TYPE = new FlatbuffersElementType("CUSTOM_TYPE");
  IElementType ENUMVAL_DECL = new FlatbuffersElementType("ENUMVAL_DECL");
  IElementType ENUM_DECL = new FlatbuffersElementType("ENUM_DECL");
  IElementType FIELD_DECL = new FlatbuffersElementType("FIELD_DECL");
  IElementType FIELD_NAME = new FlatbuffersElementType("FIELD_NAME");
  IElementType FILE_EXTENSION_DECL = new FlatbuffersElementType("FILE_EXTENSION_DECL");
  IElementType FILE_IDENTIFIER_DECL = new FlatbuffersElementType("FILE_IDENTIFIER_DECL");
  IElementType INCLUDE_DECL = new FlatbuffersElementType("INCLUDE_DECL");
  IElementType METADATA = new FlatbuffersElementType("METADATA");
  IElementType METADATA_PART = new FlatbuffersElementType("METADATA_PART");
  IElementType NAMESPACE_DECL = new FlatbuffersElementType("NAMESPACE_DECL");
  IElementType OBJECT = new FlatbuffersElementType("OBJECT");
  IElementType OBJECT_PART = new FlatbuffersElementType("OBJECT_PART");
  IElementType ROOT_DECL = new FlatbuffersElementType("ROOT_DECL");
  IElementType SCALAR = new FlatbuffersElementType("SCALAR");
  IElementType SINGLE_VALUE = new FlatbuffersElementType("SINGLE_VALUE");
  IElementType TYPE = new FlatbuffersElementType("TYPE");
  IElementType TYPE_DECL = new FlatbuffersElementType("TYPE_DECL");
  IElementType TYPE_DECL_NAME = new FlatbuffersElementType("TYPE_DECL_NAME");
  IElementType VALUE = new FlatbuffersElementType("VALUE");

  IElementType ATTRIBUTE = new FlatbuffersTokenType("ATTRIBUTE");
  IElementType BOOL = new FlatbuffersTokenType("BOOL");
  IElementType BYTE = new FlatbuffersTokenType("BYTE");
  IElementType CLOSE_BLOCK = new FlatbuffersTokenType("CLOSE_BLOCK");
  IElementType CLOSE_BRACE = new FlatbuffersTokenType("CLOSE_BRACE");
  IElementType CLOSE_PARENTHESIS = new FlatbuffersTokenType("CLOSE_PARENTHESIS");
  IElementType COLON = new FlatbuffersTokenType("COLON");
  IElementType COMMA = new FlatbuffersTokenType("COMMA");
  IElementType COMMENT = new FlatbuffersTokenType("COMMENT");
  IElementType DOT = new FlatbuffersTokenType("DOT");
  IElementType DOUBLE = new FlatbuffersTokenType("DOUBLE");
  IElementType ENUM = new FlatbuffersTokenType("ENUM");
  IElementType EQUAL = new FlatbuffersTokenType("EQUAL");
  IElementType FALSE = new FlatbuffersTokenType("FALSE");
  IElementType FILE_EXTENSION = new FlatbuffersTokenType("FILE_EXTENSION");
  IElementType FILE_IDENTIFIER = new FlatbuffersTokenType("FILE_IDENTIFIER");
  IElementType FLOAT = new FlatbuffersTokenType("FLOAT");
  IElementType FLOAT_LITERAL = new FlatbuffersTokenType("FLOAT_LITERAL");
  IElementType IDENTIFIER = new FlatbuffersTokenType("IDENTIFIER");
  IElementType INCLUDE = new FlatbuffersTokenType("INCLUDE");
  IElementType INT = new FlatbuffersTokenType("INT");
  IElementType INTEGER_LITERAL = new FlatbuffersTokenType("INTEGER_LITERAL");
  IElementType LONG = new FlatbuffersTokenType("LONG");
  IElementType NAMESPACE = new FlatbuffersTokenType("NAMESPACE");
  IElementType OPEN_BLOCK = new FlatbuffersTokenType("OPEN_BLOCK");
  IElementType OPEN_BRACE = new FlatbuffersTokenType("OPEN_BRACE");
  IElementType OPEN_PARENTHESIS = new FlatbuffersTokenType("OPEN_PARENTHESIS");
  IElementType ROOT_TYPE = new FlatbuffersTokenType("ROOT_TYPE");
  IElementType SEMICOLON = new FlatbuffersTokenType("SEMICOLON");
  IElementType SHORT = new FlatbuffersTokenType("SHORT");
  IElementType STRING = new FlatbuffersTokenType("STRING");
  IElementType STRING_LITERAL = new FlatbuffersTokenType("STRING_LITERAL");
  IElementType STRUCT = new FlatbuffersTokenType("STRUCT");
  IElementType TABLE = new FlatbuffersTokenType("TABLE");
  IElementType TRUE = new FlatbuffersTokenType("TRUE");
  IElementType UBYTE = new FlatbuffersTokenType("UBYTE");
  IElementType UINT = new FlatbuffersTokenType("UINT");
  IElementType ULONG = new FlatbuffersTokenType("ULONG");
  IElementType UNION = new FlatbuffersTokenType("UNION");
  IElementType USHORT = new FlatbuffersTokenType("USHORT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ATTRIBUTE_DECL) {
        return new FlatbuffersAttributeDeclImpl(node);
      }
      else if (type == BUILTIN_TYPE) {
        return new FlatbuffersBuiltinTypeImpl(node);
      }
      else if (type == CUSTOM_TYPE) {
        return new FlatbuffersCustomTypeImpl(node);
      }
      else if (type == ENUMVAL_DECL) {
        return new FlatbuffersEnumvalDeclImpl(node);
      }
      else if (type == ENUM_DECL) {
        return new FlatbuffersEnumDeclImpl(node);
      }
      else if (type == FIELD_DECL) {
        return new FlatbuffersFieldDeclImpl(node);
      }
      else if (type == FIELD_NAME) {
        return new FlatbuffersFieldNameImpl(node);
      }
      else if (type == FILE_EXTENSION_DECL) {
        return new FlatbuffersFileExtensionDeclImpl(node);
      }
      else if (type == FILE_IDENTIFIER_DECL) {
        return new FlatbuffersFileIdentifierDeclImpl(node);
      }
      else if (type == INCLUDE_DECL) {
        return new FlatbuffersIncludeDeclImpl(node);
      }
      else if (type == METADATA) {
        return new FlatbuffersMetadataImpl(node);
      }
      else if (type == METADATA_PART) {
        return new FlatbuffersMetadataPartImpl(node);
      }
      else if (type == NAMESPACE_DECL) {
        return new FlatbuffersNamespaceDeclImpl(node);
      }
      else if (type == OBJECT) {
        return new FlatbuffersObjectImpl(node);
      }
      else if (type == OBJECT_PART) {
        return new FlatbuffersObjectPartImpl(node);
      }
      else if (type == ROOT_DECL) {
        return new FlatbuffersRootDeclImpl(node);
      }
      else if (type == SCALAR) {
        return new FlatbuffersScalarImpl(node);
      }
      else if (type == SINGLE_VALUE) {
        return new FlatbuffersSingleValueImpl(node);
      }
      else if (type == TYPE) {
        return new FlatbuffersTypeImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new FlatbuffersTypeDeclImpl(node);
      }
      else if (type == TYPE_DECL_NAME) {
        return new FlatbuffersTypeDeclNameImpl(node);
      }
      else if (type == VALUE) {
        return new FlatbuffersValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
