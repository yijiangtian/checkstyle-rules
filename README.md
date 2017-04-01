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
