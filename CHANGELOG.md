# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.9.0] - 2018-06-19

### Changed
- Allowing empty types, empty constructors and empty method bodies.

## [1.8.0] - 2018-06-18

### Changed
- Not requiring comments for methods annotated with JUnit 5
  test annotation `ParameterizedTest`

## [1.7.0] - 2018-06-16

### Changed
- Not requiring comments for methods annotated with JUnit 5
  test annotations: `BeforeEach`, `BeforeAll`,
  `AfterEach`, `AfterAll`, `DisplayName`.

## [1.6.0] - 2018-06-16

### Changed
- Allowing start imports for `org.springframework.test.web.servlet.result.MockMvcResultMatchers` package.

## [1.5.0] - 2018-06-11

### Changed
- Not requiring JavaDoc comment for more test related annotations:
  `BeforeClass`, `AfterClass`, `After`.

## [1.4.1] - 2018-05-30

### Changed
- Removed rule ReturnCount

## [1.3.1] - 2018-05-29

### Added
- Support for suppressing warnings with an annotation
  ([SuppressWarningsFilter](http://checkstyle.sourceforge.net/config_filters.html#SuppressWarningsFilter))

## [1.2.0] - 2018-05-28

### Changed
- Reduced max line length to 120

### Removed
- Removed rule MultipleStringLiteralsCheck

## [1.1.0] - 2018-05-05

### Added
- Added editorconfig, gitattributes.
- Automatic deployment to Nexus on git tag.

### Changed
- Using latest checkstyle plugin.
- Upgraded plugins.

## [1.0.16] - 2017-06-15

### Added
- Allowing an external supression XML file.

### Changed
- Relaxing MagicNumber rule
- Showing how to configure a different checkstyle version.

## [1.0.8] - 2017-06-14

### Added
- Adding documentation for rules
- Added links to rules documentation
- Added  travis support

### Changed
- Increased max line length to 150.
- Upgraded checkstyle rules
- Adding awt and swing to allowed star import
- Amended rules for JavadocMethod
- Enabling inline conditionals

## [1.0.2] - 2017-03-31

- Initial release

[Unreleased]: https://github.com/ngeor/checkstyle-rules/compare/v1.9.0...HEAD
[1.9.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.8.0...v1.9.0
[1.8.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.7.0...v1.8.0
[1.7.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.6.0...v1.7.0
[1.6.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.5.0...v1.6.0
[1.5.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.4.1...v1.5.0
[1.4.1]: https://github.com/ngeor/checkstyle-rules/compare/v1.3.1...v1.4.1
[1.3.1]: https://github.com/ngeor/checkstyle-rules/compare/v1.2.0...v1.3.1
[1.2.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.1.0...v1.2.0
[1.1.0]: https://github.com/ngeor/checkstyle-rules/compare/v1.0.16...v1.1.0
[1.0.16]: https://github.com/ngeor/checkstyle-rules/compare/v1.0.8...v1.0.16
[1.0.8]: https://github.com/ngeor/checkstyle-rules/compare/v1.0.2...v1.0.8
[1.0.2]: https://github.com/ngeor/checkstyle-rules/tree/v1.0.2
