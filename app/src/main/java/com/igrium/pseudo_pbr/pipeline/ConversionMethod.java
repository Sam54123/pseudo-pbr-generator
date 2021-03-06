package com.igrium.pseudo_pbr.pipeline;

import java.io.File;
import java.nio.file.Path;

import com.igrium.pseudo_pbr.pipeline.texture_sets.TextureSet;

public interface ConversionMethod<T extends TextureSet> {

    /**
     * Get the texture set that this conversion method wants to use. Place the
     * desired textures in this texture set.
     * 
     * @return Active texture set.
     */
    public T getTextureSet();
    
    /**
     * Execute the conversion.
     * 
     * @param inputModel   The QC file on which the conversion will happen.
     * 
     * @param gameFiles    File consumer to take files that go in the
     *                     <code>game</code> directory.
     * @param contentFiles File consumer to take files that go in the
     *                     <code>content</code> directory.
     * @param inputFile    Target QC file.
     * @param enginePath   The path where engine executables can be found.
     * @param progress     A progress listener to recieve updates about the
     *                     conversion process.
     * @throws Exception If anything goes wrong in the process.
     */
    public void execute(File inputModel, FileConsumer gameFiles, FileConsumer contentFiles, Path enginePath, ProgressListener progress) throws Exception;
}
