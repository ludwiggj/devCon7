package fragments.objects

object j_maps extends App {
  val capitalOfCountry =
    Map("US" -> "Washington", "England" -> "London")

  val capitalOfUS = capitalOfCountry("US")
  
  //capitalOfUS = "bob"

  //var capitalOfFrance = capitalOfCountry("France")

  val capitalOfCountryWithDefault =
    capitalOfCountry withDefaultValue "<unknown>"

  val capitalOfEngland = capitalOfCountryWithDefault("England")

  var capitalOfFrance = capitalOfCountryWithDefault("France")
  
  // Output results
  println("Capital of US      = " + capitalOfUS)
  println("Capital of England = " + capitalOfEngland)
  println("Capital of France  = " + capitalOfFrance)
}