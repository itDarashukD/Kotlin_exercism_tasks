/*- `G` -> `C`
  - `C` -> `G`
  - `T` -> `A`
  - `A` -> `U`*/

fun transcribeToRna(dna: String): String {
    var builder = StringBuilder()
    for (element in dna)
        when (element) {
            'G' -> builder.append('C')
            'C' -> builder.append('G')
            'T' -> builder.append('A')
            'A' -> builder.append('U')
        }

    return builder.toString()
}
