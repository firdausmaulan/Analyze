package com.fd.analyze;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainUnitTest {

    private final MainPresenter presenter = new MainPresenter();

    @Test
    public void calculate_isIdeal() {
        String result = presenter.calculateBMI(175, 70);
        assertEquals(MainPresenter.IDEAL, result);
    }

    @Test
    public void calculate_isNotIdeal() {
        String result = presenter.calculateBMI(175, 71);
        assertEquals(MainPresenter.NOT_IDEAL, result);
    }
}