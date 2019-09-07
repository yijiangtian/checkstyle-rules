package com.github.ngeor.checkstyle.rules;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.Checker;
import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;

import static com.puppycrawl.tools.checkstyle.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests the LineLength check.
 */
@SuppressWarnings("checkstyle:MagicNumber")
class LineLengthTest {
    private EventCollector eventCollector;
    private Checker checker;

    @BeforeEach
    void beforeEach() throws CheckstyleException {
        eventCollector = new EventCollector();
        checker = Utils.createChecker(eventCollector);
    }

    @AfterEach
    void afterEach() {
        checker.destroy();
    }

    @Test
    void success() throws CheckstyleException {
        final String file = "LineLengthTooLong.java";
        final int errorCount = Utils.process(checker, file);
        assertThat(errorCount).isEqualTo(1);
        assertThat(eventCollector.getAuditEvents()).hasSize(1);
        assertThat(eventCollector.getAuditEvents().get(0))
            .hasLine(9)
            .hasColumn(0)
            .hasSeverityLevel(SeverityLevel.ERROR)
            .hasSourceName("com.puppycrawl.tools.checkstyle.checks.sizes.LineLengthCheck")
            .hasFileName(Utils.expectedFileName(file));
    }
}
