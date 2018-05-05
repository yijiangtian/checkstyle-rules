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
                    <version>3.0.0</version>
                    <dependencies>
                        <dependency>
                            <groupId>com.github.ngeor</groupId>
                            <artifactId>checkstyle-rules</artifactId>
                            <version>1.1.0</version>
                        </dependency>
                        <dependency>
                            <groupId>com.puppycrawl.tools</groupId>
                            <artifactId>checkstyle</artifactId>
                            <version>8.10</version>
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

## [Javadoc](http://checkstyle.sourceforge.net/config_javadoc.html)

Same as sun_checks:

- [JavadocType](http://checkstyle.sourceforge.net/config_javadoc.html#JavadocType): Checks for Javadoc comments on types.
- [JavadocStyle](http://checkstyle.sourceforge.net/config_javadoc.html#JavadocStyle): Checks the style of Javadoc comments.

### [JavadocPackage](http://checkstyle.sourceforge.net/config_javadoc.html#JavadocPackage)

This rule is disabled, so documentation is not needed for each package.

### [JavadocMethod](http://checkstyle.sourceforge.net/config_javadoc.html#JavadocMethod)

This rule is relaxed:

- no need to document private methods
- no need to document property getters/setters
- no need to document one-liners
- no need to document overrides and test methods
- no need to provide full information for parameters, throws and return types

### [JavadocVariable](http://checkstyle.sourceforge.net/config_javadoc.html#JavadocVariable)

This rule is relaxed: no need to document private fields.

## [Naming conventions](http://checkstyle.sourceforge.net/config_naming.html)

Same as sun_checks:

- [ConstantName](http://checkstyle.sourceforge.net/config_naming.html#ConstantName)
- [LocalFinalVariableName](http://checkstyle.sourceforge.net/config_naming.html#LocalFinalVariableName)
- [LocalVariableName](http://checkstyle.sourceforge.net/config_naming.html#LocalVariableName)
- [MemberName](http://checkstyle.sourceforge.net/config_naming.html#MemberName)
- [PackageName](http://checkstyle.sourceforge.net/config_naming.html#PackageName)
- [ParameterName](http://checkstyle.sourceforge.net/config_naming.html#ParameterName)
- [StaticVariableName](http://checkstyle.sourceforge.net/config_naming.html#StaticVariableName)
- [TypeName](http://checkstyle.sourceforge.net/config_naming.html#TypeName)

### [MethodName](http://checkstyle.sourceforge.net/config_naming.html#MethodName)

For this rule, the Google flavor of the rule is used, in order to allow
underscores in method names. The intention is for underscores to be used
in unit test method names, in the format of:

```
methodUnderTest_conditions_result
```

## [Imports](http://checkstyle.sourceforge.net/config_imports.html)

Same as sun_checks:

- [IllegalImport](http://checkstyle.sourceforge.net/config_imports.html#IllegalImport)
- [RedundantImport](http://checkstyle.sourceforge.net/config_imports.html#RedundantImport)
- [UnusedImports](http://checkstyle.sourceforge.net/config_imports.html#UnusedImports)

### [AvoidStarImport](http://checkstyle.sourceforge.net/config_imports.html#AvoidStarImport)

Star import is allowed for:

- java.awt
- java.io
- java.util
- javax.swing
- java.lang.Math
- org.junit.Assert
- org.mockito.Mockito

## [Size Violations](http://checkstyle.sourceforge.net/config_sizes.html)

Same as sun_checks:

- [FileLength](http://checkstyle.sourceforge.net/config_sizes.html#FileLength)
- [MethodLength](http://checkstyle.sourceforge.net/config_sizes.html#MethodLength)
- [ParameterNumber](http://checkstyle.sourceforge.net/config_sizes.html#ParameterNumber)

### [LineLength](http://checkstyle.sourceforge.net/config_sizes.html#LineLength)

This rule is relaxed from 80 to 150 characters.

## [Whitespace](http://checkstyle.sourceforge.net/config_whitespace.html)

Same as sun_checks:

- [EmptyForIteratorPad](http://checkstyle.sourceforge.net/config_whitespace.html#EmptyForIteratorPad)
- [GenericWhitespace](http://checkstyle.sourceforge.net/config_whitespace.html#GenericWhitespace)
- [MethodParamPad](http://checkstyle.sourceforge.net/config_whitespace.html#MethodParamPad)
- [NoWhitespaceAfter](http://checkstyle.sourceforge.net/config_whitespace.html#NoWhitespaceAfter)
- [NoWhitespaceBefore](http://checkstyle.sourceforge.net/config_whitespace.html#NoWhitespaceBefore)
- [OperatorWrap](http://checkstyle.sourceforge.net/config_whitespace.html#OperatorWrap)
- [ParenPad](http://checkstyle.sourceforge.net/config_whitespace.html#ParenPad)
- [TypecastParenPad](http://checkstyle.sourceforge.net/config_whitespace.html#TypecastParenPad)
- [WhitespaceAfter](http://checkstyle.sourceforge.net/config_whitespace.html#WhitespaceAfter)
- [WhitespaceAround](http://checkstyle.sourceforge.net/config_whitespace.html#WhitespaceAround)
- [FileTabCharacter](http://checkstyle.sourceforge.net/config_whitespace.html#FileTabCharacter)

### [EmptyLineSeparator](http://checkstyle.sourceforge.net/config_whitespace.html#EmptyLineSeparator)

Requires empty lines between elements with these extra requirements:

- no multiple empty lines are allowed
- no empty lines are required between fields

**Examples**

```
//
// invalid: multiple empty lines
//
private String name;

<------ too many empty lines
private String address;

//
// valid: single line between fields
//
private String name;

private String address;

//
// valid: no lines between fields
//
private String name;
private String address;

//
// invalid: no lines between methods
//
private String getName() {
    return name;
} <----- needs empty line
private String getAddress() {
    return address;
}
```

## [Modifier Checks](http://checkstyle.sourceforge.net/config_modifier.html)

Same as sun_checks:

- [ModifierOrder](http://checkstyle.sourceforge.net/config_modifier.html#ModifierOrder)
- [RedundantModifier](http://checkstyle.sourceforge.net/config_modifier.html#RedundantModifier)

## [Blocks](http://checkstyle.sourceforge.net/config_blocks.html)

Same as sun_checks:

- [AvoidNestedBlocks](http://checkstyle.sourceforge.net/config_blocks.html#AvoidNestedBlocks)
- [EmptyBlock](http://checkstyle.sourceforge.net/config_blocks.html#EmptyBlock)
- [LeftCurly](http://checkstyle.sourceforge.net/config_blocks.html#LeftCurly)
- [NeedBraces](http://checkstyle.sourceforge.net/config_blocks.html#NeedBraces)
- [RightCurly](http://checkstyle.sourceforge.net/config_blocks.html#RightCurly)

## [Coding](http://checkstyle.sourceforge.net/config_coding.html)

Same as sun_checks:

- [EmptyStatement](http://checkstyle.sourceforge.net/config_coding.html#EmptyStatement)
- [EqualsHashCode](http://checkstyle.sourceforge.net/config_coding.html#EqualsHashCode)
- [IllegalInstantiation](http://checkstyle.sourceforge.net/config_coding.html#IllegalInstantiation)
- [InnerAssignment](http://checkstyle.sourceforge.net/config_coding.html#InnerAssignment)
- [MissingSwitchDefault](http://checkstyle.sourceforge.net/config_coding.html#MissingSwitchDefault)
- [SimplifyBooleanExpression](http://checkstyle.sourceforge.net/config_coding.html#SimplifyBooleanExpression)
- [SimplifyBooleanReturn](http://checkstyle.sourceforge.net/config_coding.html#SimplifyBooleanReturn)

### [AvoidInlineConditionals](http://checkstyle.sourceforge.net/config_coding.html#AvoidInlineConditionals)

This rule is disabled, so it is permitted to write `int max = (x > y) ? x : y;`

### [HiddenField](http://checkstyle.sourceforge.net/config_coding.html#HiddenField)

This rule is relaxed to permit hiding local fields within constructors and setters.

### [MagicNumber](http://checkstyle.sourceforge.net/config_coding.html#MagicNumber)

The rule is relaxed, allowing magic numbers in field declarations, annotations and the hashCode method.

### [CovariantEquals](http://checkstyle.sourceforge.net/config_coding.html#CovariantEquals)
Checks that classes which define a covariant equals() method also override method equals(Object).

### [DeclarationOrder](http://checkstyle.sourceforge.net/config_coding.html#DeclarationOrder)
Checks that class or interface members appear in the order of: static fields, fields, constructors, methods. For fields, access level is also taken into account: public, protected, package, private.

### [DefaultComesLast](http://checkstyle.sourceforge.net/config_coding.html#DefaultComesLast)
Check that the default is after all the cases in a switch statement.

### [EqualsAvoidNull](http://checkstyle.sourceforge.net/config_coding.html#EqualsAvoidNull)
Checks that any combination of String literals is on the left side of an equals() comparison.

### [ExplicitInitialization](http://checkstyle.sourceforge.net/config_coding.html#ExplicitInitialization)
Checks if any class or object member is explicitly initialized to default for its type value (null for object references, zero for numeric types and char and false for boolean.

### [FallThrough](http://checkstyle.sourceforge.net/config_coding.html#FallThrough)
Checks for fall-through in switch statements. Finds locations where a case contains Java code but lacks a break, return, throw or continue statement.

### [IllegalCatch](http://checkstyle.sourceforge.net/config_coding.html#IllegalCatch)
Checks that certain exception types do not appear in a catch statement.

### [IllegalThrows](http://checkstyle.sourceforge.net/config_coding.html#IllegalThrows)
This check can be used to ensure that types are not declared to be thrown.

### [IllegalTokenText](http://checkstyle.sourceforge.net/config_coding.html#IllegalTokenText)

### [IllegalType](http://checkstyle.sourceforge.net/config_coding.html#IllegalType)
Checks that particular classes are never used as types in variable declarations, return values or parameters.

### [ModifiedControlVariable](http://checkstyle.sourceforge.net/config_coding.html#ModifiedControlVariable)
Check for ensuring that for loop control variables are not modified inside the for block.

### [MultipleStringLiterals](http://checkstyle.sourceforge.net/config_coding.html#MultipleStringLiterals)
Checks for multiple occurrences of the same string literal within a single file.

### [MultipleVariableDeclarations](http://checkstyle.sourceforge.net/config_coding.html#MultipleVariableDeclarations)
Checks that each variable declaration is in its own statement and on its own line.

### [NestedForDepth](http://checkstyle.sourceforge.net/config_coding.html#NestedForDepth)
Restricts nested for blocks to a specified depth (default = 1).

### [NestedIfDepth](http://checkstyle.sourceforge.net/config_coding.html#NestedIfDepth)
Restricts nested if-else blocks to a specified depth (default = 1).

### [NestedTryDepth](http://checkstyle.sourceforge.net/config_coding.html#NestedTryDepth)
Restricts nested try blocks to a specified depth (default = 1).

### [NoClone](http://checkstyle.sourceforge.net/config_coding.html#NoClone)
Checks that the clone method is not overridden from the Object class.

### [NoFinalizer](http://checkstyle.sourceforge.net/config_coding.html#NoFinalizer)
Verifies there are no finalize() methods defined in a class.

### [OneStatementPerLine](http://checkstyle.sourceforge.net/config_coding.html#OneStatementPerLine)
Checks that there is only one statement per line.

### [OverloadMethodsDeclarationOrder](http://checkstyle.sourceforge.net/config_coding.html#OverloadMethodsDeclarationOrder)
Checks that overload methods are grouped together.

### [PackageDeclaration](http://checkstyle.sourceforge.net/config_coding.html#PackageDeclaration)
Ensures that a class has a package declaration, and whether the package name matches the directory name for the source file.

### [ParameterAssignment](http://checkstyle.sourceforge.net/config_coding.html#ParameterAssignment)
Disallows assignment of parameters.

**Example**

```
private void hello(String name) {
    name = name.toUpperCase(); <-- wrong
}
```

### [ReturnCount](http://checkstyle.sourceforge.net/config_coding.html#ReturnCount)
Restricts the number of return statements in methods, constructors and lambda expressions (2 by default). Ignores specified methods (equals() by default).

### [StringLiteralEquality](http://checkstyle.sourceforge.net/config_coding.html#StringLiteralEquality)
Checks that string literals are not used with == or !=.

### [UnnecessaryParentheses](http://checkstyle.sourceforge.net/config_coding.html#UnnecessaryParentheses)
Checks for the use of unnecessary parentheses.


## [Class design](http://checkstyle.sourceforge.net/config_design.html)

Same as sun_checks:

- [FinalClass](http://checkstyle.sourceforge.net/config_design.html#FinalClass)
- [HideUtilityClassConstructor](http://checkstyle.sourceforge.net/config_design.html#HideUtilityClassConstructor)
- [InterfaceIsType](http://checkstyle.sourceforge.net/config_design.html#InterfaceIsType)
- [VisibilityModifier](http://checkstyle.sourceforge.net/config_design.html#VisibilityModifier)

### [DesignForExtension](http://checkstyle.sourceforge.net/config_design.html#DesignForExtension)

This rule is disabled.

## [Miscellaneous](http://checkstyle.sourceforge.net/config_misc.html)

Same as sun_checks:

- [ArrayTypeStyle](http://checkstyle.sourceforge.net/config_misc.html#ArrayTypeStyle)
- [TodoComment](http://checkstyle.sourceforge.net/config_misc.html#TodoComment)
- [UpperEll](http://checkstyle.sourceforge.net/config_misc.html#UpperEll)
- [NewlineAtEndOfFile](http://checkstyle.sf.net/config_misc.html#NewlineAtEndOfFile)
- [Translation](http://checkstyle.sf.net/config_misc.html#Translation)
- [RegexpSingleline](http://checkstyle.sf.net/config_misc.html)

### [FinalParameters](http://checkstyle.sourceforge.net/config_misc.html#FinalParameters)

This rule is disabled in favor of the rule *ParameterAssignment*.

### [CommentsIndentation](http://checkstyle.sourceforge.net/config_misc.html#CommentsIndentation)
Controls the indentation between comments and surrounding code. Comments are indented at the same level as the surrounding code.

# Suppressions

It is possible to specify an [XML file with supressions](http://checkstyle.sourceforge.net/config_filters.html#SuppressionFilter). The file is optional and it needs to be in `checkstyle/suppressions.xml`.

Example file to ignore magic numbers and multiple string literals in unit tests:

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suppressions PUBLIC
    "-//Puppy Crawl//DTD Suppressions 1.0//EN"
    "http://checkstyle.sourceforge.net/dtds/suppressions_1_0.dtd">
<suppressions>
    <suppress files="Test.java$" checks="MagicNumber" />
    <suppress files="Test.java$" checks="MultipleStringLiterals" />
</suppressions>
```
