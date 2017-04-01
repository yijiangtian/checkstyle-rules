# checkstyle-rules
Rules for checkstyle. Share rules among projects.

[![Build Status](https://travis-ci.org/ngeor/checkstyle-rules.svg?branch=master)](https://travis-ci.org/ngeor/checkstyle-rules)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ngeor/checkstyle-rules/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.ngeor/checkstyle-rules)


# Overview

The rules are based on the default Sun checks, with some modifications.

# Usage

You can configure the maven-checkstyle-plugin in this way:

```
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-checkstyle-plugin</artifactId>
                    <version>${maven.checkstyle.plugin.version}</version>
                    <dependencies>
                        <dependency>
                            <groupId>com.github.ngeor</groupId>
                            <artifactId>checkstyle-rules</artifactId>
                            <version>1.0.8</version>
                        </dependency>
                    </dependencies>
                    <configuration>
                        <configLocation>com/github/ngeor/checkstyle.xml</configLocation>
                        <includeTestSourceDirectory>true</includeTestSourceDirectory>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <configuration>
                    <configLocation>com/github/ngeor/checkstyle.xml</configLocation>
                    <includeTestSourceDirectory>true</includeTestSourceDirectory>
                </configuration>
            </plugin>
        </plugins>
    </reporting>
```

# Rules in details

## General

Same as sun_checks:

- [NewlineAtEndOfFile](http://checkstyle.sf.net/config_misc.html#NewlineAtEndOfFile): Checks whether files end with a new line.
- [Translation](http://checkstyle.sf.net/config_misc.html#Translation): Checks that property files contain the same keys.
- [FileTabCharacter](http://checkstyle.sf.net/config_whitespace.html): Checks for whitespace.
- [RegexpSingleline](http://checkstyle.sf.net/config_misc.html): Checks for trailing spaces.

## [Javadoc](http://checkstyle.sf.net/config_javadoc.html)

Same as sun_checks:

- JavadocType: Checks for Javadoc comments on types.
- JavadocStyle: Checks the style of Javadoc comments.

### JavadocPackage

This rule is disabled, so documentation is not needed for each package.

### JavadocMethod

This rule is relaxed:

- no need to document private methods
- no need to document property getters/setters
- no need to document one-liners
- no need to document overrides and test methods
- no need to provide full information for parameters, throws and return types

### JavadocVariable

This rule is relaxed: no need to document private fields.

## [Naming conventions](http://checkstyle.sf.net/config_naming.html)

Same as sun_checks:

- ConstantName
- LocalFinalVariableName
- LocalVariableName
- MemberName
- PackageName
- ParameterName
- StaticVariableName
- TypeName

### MethodName

For this rule, the Google flavor of the rule is used, in order to allow
underscores in method names. The intention is for underscores to be used
in unit test method names, in the format of:

```
methodUnderTest_conditions_result
```

## [Imports](http://checkstyle.sf.net/config_imports.html)

Same as sun_checks:

- IllegalImport
- RedundantImport
- UnusedImports

### AvoidStarImport

Star import is allowed for:

- java.awt
- java.io
- java.util
- javax.swing
- java.lang.Math
- org.junit.Assert
- org.mockito.Mockito

## [Size Violations](http://checkstyle.sf.net/config_sizes.html)

Same as sun_checks:

- FileLength
- MethodLength
- ParameterNumber

### LineLength

This rule is relaxed from 80 to 120 characters.

## [Whitespace](http://checkstyle.sf.net/config_whitespace.html)

Same as sun_checks:

- EmptyForIteratorPad
- GenericWhitespace
- MethodParamPad
- NoWhitespaceAfter
- NoWhitespaceBefore
- OperatorWrap
- ParenPad
- TypecastParenPad
- WhitespaceAfter
- WhitespaceAround

## [Modifier Checks](http://checkstyle.sf.net/config_modifiers.html)

Same as sun_checks:

- ModifierOrder
- RedundantModifier

## [Blocks](http://checkstyle.sf.net/config_blocks.html)

Same as sun_checks:

- AvoidNestedBlocks
- EmptyBlock
- LeftCurly
- NeedBraces
- RightCurly

## [Coding](http://checkstyle.sf.net/config_coding.html)

Same as sun_checks:

- EmptyStatement
- EqualsHashCode
- IllegalInstantiation
- InnerAssignment
- MagicNumber
- MissingSwitchDefault
- SimplifyBooleanExpression
- SimplifyBooleanReturn

### AvoidInlineConditionals

This rule is disabled, so it is permitted to write `int max = (x > y) ? x : y;`

### HiddenField

This rule is relaxed to permit hiding local fields within constructors and setters.

### CovariantEquals
### DeclarationOrder
### DefaultComesLast
### EqualsAvoidNull
### ExplicitInitialization
### FallThrough
### IllegalCatch
### IllegalThrows
### IllegalTokenText
### IllegalType
### ModifiedControlVariable
### MultipleStringLiterals
### MultipleVariableDeclarations
### NestedForDepth
### NestedTryDepth
### NoClone
### NoFinalizer
### OneStatementPerLine
### OverloadMethodsDeclarationOrder
### PackageDeclaration
### ParameterAssignment
### ReturnCount
### StringLiteralEquality
### UnnecessaryParentheses

## [Class design](http://checkstyle.sf.net/config_design.html)

Same as sun_checks:

- FinalClass
- HideUtilityClassConstructor
- InterfaceIsType
- VisibilityModifier

### DesignForExtension

This rule is disabled.

## [Miscellaneous](http://checkstyle.sf.net/config_misc.html)

Same as sun_checks:

- ArrayTypeStyle
- TodoComment
- UpperEll

### FinalParameters

This rule is disabled.

### CommentsIndentation

### EmptyLineSeparator

Requires empty lines between elements with these extra requirements:

- no multiple empty lines are allowed
- no empty lines are required between fields
