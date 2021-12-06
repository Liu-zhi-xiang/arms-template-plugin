package com.github.liuzhixiang.armstemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.liuzhixiang.armstemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
