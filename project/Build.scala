import sbt._


object SchoolverslagBuild extends Build {
    lazy val root = Project(id = "schoolverslag",
                            base = file(".")) aggregate(domain,service)

    lazy val domain = Project(id = "schoolverslag-domain",
                           base = file("schoolverslag-domain"))

    lazy val service = Project(id = "schoolverslag-service",
                           base = file("schoolverslag-service")) dependsOn(domain)
}
