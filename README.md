# checkstyle-rules
Rules for checkstyle. Share rules among projects.

[![Build Status](https://travis-ci.org/ngeor/checkstyle-rules.svg?branch=master)](https://travis-ci.org/ngeor/checkstyle-rules)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.ngeor/checkstyle-rules/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.ngeor/checkstyle-rules)


# Overview

The rules are based on the default Sun checks, with some modifications.

## AvoidStarImport

Star import is allowed for:

- java.awt
- java.io
- java.util
- javax.swing
- java.lang.Math
- org.junit.Assert
- org.mockito.Mockito

## JavadocMethod

Rules are relaxed a bit:

- no need to document private methods
- no need to document property getters/setters
- no need to document one-liners
- no need to document overrides and test methods
- no need to provide full information for parameters, throws and return types

## AvoidInlineConditionals

Inline conditionals are permitted.
