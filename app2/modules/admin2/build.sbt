// It is good practice to name your sub-modules <root-project>-<sub-module>
name := "play-multi-project-app-2-admin"

// With this setting you can name your routes as you wish; just note the uppercase R
PlayKeys.devSettings += "play.http.router" -> "admin2.Routes"

//PlayKeys.generateRefReverseRouter := false
