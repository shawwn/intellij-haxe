// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeLocalFunctionDeclaration extends HaxeComponent {

  @Nullable
  HaxeBlockStatement getBlockStatement();

  @NotNull
  HaxeComponentName getComponentName();

  @Nullable
  HaxeExpression getExpression();

  @Nullable
  HaxeGenericParam getGenericParam();

  @Nullable
  HaxeParameterList getParameterList();

  @Nullable
  HaxeReturnStatement getReturnStatement();

  @Nullable
  HaxeThrowStatement getThrowStatement();

  @Nullable
  HaxeTypeTag getTypeTag();

}
