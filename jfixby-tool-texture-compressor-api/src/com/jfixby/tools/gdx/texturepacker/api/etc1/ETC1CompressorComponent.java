package com.jfixby.tools.gdx.texturepacker.api.etc1;

import java.io.IOException;

import com.jfixby.cmns.api.file.FileFilter;

public interface ETC1CompressorComponent {

    ETC1AtlasCompressorSettings newAtlasCompressionSettings();

    ETC1AtlasCompressionResult compress(ETC1AtlasCompressorSettings settings) throws IOException;

    AlphaChannelExtractor newAlphaChannelExtractor(AlphaChannelExtractorSpecs alphaExtractorSpecs);

    AlphaChannelExtractorSpecs newAlphaChannelExtractorSpecs();

    

}
