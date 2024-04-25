package polimerasa

sealed abstract case class NitrogenousBases(letter: String)

object NitrogenousBases {
  final case object CYTOSINE extends NitrogenousBases(letter = "C")

  final case object GUANINE extends NitrogenousBases(letter = "G")

  final case object ADENINE extends NitrogenousBases(letter = "A")

  final case object THYMINE extends NitrogenousBases(letter = "T")

  final case object URACIL extends NitrogenousBases(letter = "U")

  def fromLetter(letter: String): NitrogenousBases = {
    letter match {
      case "C" => CYTOSINE
      case "G" => GUANINE
      case "A" => ADENINE
      case "T" => THYMINE
      case "U" => URACIL
      case _ => throw new Exception("Nitrogenous Base of given letter not found")
    }
  }

  def toLetter(nitrogenousBases: NitrogenousBases): String = {
    nitrogenousBases.letter
  }

  def complementary(nitrogenousBases: NitrogenousBases): NitrogenousBases = {
    nitrogenousBases match {
      case ADENINE => THYMINE
      case THYMINE => ADENINE
      case CYTOSINE => GUANINE
      case GUANINE => CYTOSINE
      case URACIL => ADENINE
      case _ => throw new Exception("Unknown Nitrogenous base")
    }
  }
}