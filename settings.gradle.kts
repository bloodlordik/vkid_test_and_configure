import java.net.URI

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
           url = URI("https://artifactory-external.vkpartner.ru/artifactory/superappkit-maven-public/")
        }

    }
}

rootProject.name = "Vk test auth"
include(":app")
