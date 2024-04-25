package polimerasa

sealed abstract case class AminoAcids(short: String, abbrev:String,codons: Array[String])
object AminoAcids{
  final case object ALANINE extends AminoAcids("A", "Ala", Array("GCU", "GCC", "GCA", "GCG"))
  final case object CYSTEINE extends AminoAcids("C", "Cys", Array("UGU", "UGC"))
  final case object ASPARTIC_ACID extends AminoAcids("D", "Asp", Array("GAU", "GAC"))
  final case object GLUTAMIC_ACID extends AminoAcids("E", "Glu", Array("GAA", "GAG"))
  final case object PHENYLALANINE extends AminoAcids("F", "Phe", Array("UUU", "UUC"))
  final case object GLYCINE extends AminoAcids("G", "Gly", Array("GGU", "GGC", "GGA", "GGG"))
  final case object HISTIDINE extends AminoAcids("H", "His", Array("CAU","CAC"))
  final case object ISOLEUCINE extends AminoAcids("I", "Ile", Array(	"AUU", "AUC", "AUA"))
  final case object LYSINE extends AminoAcids("K", "Ala", Array("AAA","AAG"))
  final case object LEUCINE extends AminoAcids("L", "Leu", Array("UUA", "UUG", "CUU", "CUC", "CUA", "CUG"))
  final case object METHIONINE extends AminoAcids("M", "Met", Array("AUG"))
  final case object ASPARAGINE extends AminoAcids("N", "Asn", Array("AAU", "AAC"))
//  final case object PYRROLYSINE extends AminoAcids("O", "Pyl", Array()) doesnt exist in humans so it's out of scope of the PolymerasaToolkit
  final case object PROLINE extends AminoAcids("P", "Pro", Array("CCU", "CCC", "CCA", "CCG"))
  final case object GLUTAMINE extends AminoAcids("Q", "Gln", Array("CAA", "CAG"	))
  final case object ARGININE extends AminoAcids("R", "Arg", Array("CGU", "CGC", "CGA", "CGG", "AGA", "AGG"))
  final case object SERINE extends AminoAcids("S", "Ser", Array("UCU", "UCC", "UCA", "UCG", "AGU", "AGC"))
  final case object THREONINE extends AminoAcids("T", "Thr", Array("ACU", "ACC", "ACA", "ACG"))
//  final case object SELENOCYSTEINE extends AminoAcids("U", "Sec", Array()) doesnt exist in humans so it's out of scope of the PolymerasaToolkit
  final case object VALINE extends AminoAcids("V", "Val", Array("GUU", "GUC", "GUA", "GUG"))
  final case object TRYPTOPHAN extends AminoAcids("W", "Trp", Array("UGG"))
  final case object TYROSINE extends AminoAcids("Y", "Tyr", Array("UAU, UAC"))
  final case object STOP extends AminoAcids("-", "Stp", Array("UAA", "UAG", "UGA"))
}
