# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [1.7.0] - 2018-06-16

- Not requiring comments for methods annotated with JUnit 5
  test attributes: `BeforeEach`, `BeforeAll`,
  `AfterEach`, `AfterAll`, `DisplayName`.

## [1.6.0] - 2018-06-16

- Allowing start imports for `org.springframework.test.web.servlet.result.MockMvcResultMatchers` package.

## [1.5.0] - 2018-06-11

- Not requiring JavaDoc comment for more test related attributes:
  `BeforeClass`, `AfterClass`, `After`.

## [1.4.1] - 2018-05-30

- Removed rule ReturnCount

## [1.3.1] - 2018-05-29

- Support for suppressing warnings with an annotation
  ([SuppressWarningsFilter](http://checkstyle.sourceforge.net/config_filters.html#SuppressWarningsFilter))

## [1.2.0] - 2018-05-28

- Removed rule MultipleStringLiteralsCheck
- Reduced max line length to 120

## [1.1.0] - 2018-05-05

- Using latest checkstyle plugin.
- Added editorconfig, gitattributes.
- Automatic deployment to Nexus on git tag.
- Upgraded plugins.

## [1.0.16] - 2017-06-15

- Allowing an external supression XML file.
- Relaxing MagicNumber rule
- Showing how to configure a different checkstyle version.

## [1.0.8] - 2017-06-14

- Increased max line length to 150.
- Upgraded checkstyle rules
- Adding awt and swing to allowed star import
- Amended rules for JavadocMethod
- Enabling inline conditionals
- Adding documentation for rules
- Added links to rules documentation
- Added  travis support

## [1.0.2] - 2017-03-31

- Initial release
