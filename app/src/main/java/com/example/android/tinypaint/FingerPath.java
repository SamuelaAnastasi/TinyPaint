package com.example.android.tinypaint;

import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by the_insider on 19/12/2017.
 */

public class FingerPath {
    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
