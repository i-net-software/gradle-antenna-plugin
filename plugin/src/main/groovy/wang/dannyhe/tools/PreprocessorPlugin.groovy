package wang.dannyhe.tools

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException

public class PreprocessorPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //init the extensions
        project.extensions.create('preprocessor', PluginGlobalSettingExtension)
    }
}

class PluginGlobalSettingExtension {
    File sourceDir
    File targetDir
    boolean verbose = true
    String groupName = "preprocessor"
}