package de.inetsoftware

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException

public class AntennaPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //init the extensions
        project.extensions.create('antenna', PluginGlobalSettingExtension)
    }
}

class PluginGlobalSettingExtension {
    File sourceDir
    File targetDir
    boolean verbose = true
    String groupName = "antenna"
}