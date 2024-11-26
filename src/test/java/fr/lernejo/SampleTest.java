package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void operation_add_should_return_correct_result() {
        int result = sample.op(Sample.Operation.ADD, 2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void operation_mult_should_return_correct_result() {
        int result = sample.op(Sample.Operation.MULT, 2, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void factorial_of_5_should_return_120() {
        int result = sample.fact(5);
        assertThat(result).isEqualTo(120);
    }

    @Test
    void factorial_negative_should_throw_exception() {
        assertThatThrownBy(() -> sample.fact(-1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("N should be positive");
    }
}

