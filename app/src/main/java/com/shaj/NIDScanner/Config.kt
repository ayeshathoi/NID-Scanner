package cz.adaptech.tesseract4android.sample

import com.googlecode.tesseract.android.TessBaseAPI

object Config {
    const val TESS_ENGINE = TessBaseAPI.OEM_LSTM_ONLY
    const val TESS_LANG = "eng"
    const val IMAGE_NAME = "sample.png"
}