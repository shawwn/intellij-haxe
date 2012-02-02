// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugins.haxe.lang.lexer.HaxeTokenTypes.*;
import com.intellij.plugins.haxe.lang.psi.*;

public class HaxeTypeImpl extends HaxeFunctionTypeImpl implements HaxeType {

  public HaxeTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public HaxeReferenceExpression getReferenceExpression() {
    return findNotNullChildByClass(HaxeReferenceExpression.class);
  }

  @Override
  @Nullable
  public HaxeTypeParam getTypeParam() {
    return findChildByClass(HaxeTypeParam.class);
  }

}
