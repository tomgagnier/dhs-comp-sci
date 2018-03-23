package term1.assignments;

/**
 * You are the moderator of a message board on Mars, and your job is to flag inappropriate comments. Unfortunately, kids
 * these days are cursing faster than you can keep up, so you want to build a program to help you keep up with it.
 *
 * Your program takes as input one message board post. A message board post has the following form:
 *
 * UsernameWithNoSpaces - message that may be multiple words Example:
 *
 * Alien25 - ojag qey afoh aoh foghg ^^ ljjls ^^ lsjflsfj! If there is a Martian swear word in the input, you want to
 * flag the post and the user that posted it. Martian swear words are:
 *
 * ^^ qey $ Be careful though, like with bad words in English, these are only bad words when they’re not a part of a
 * longer word. So, for example, you’ll need to make sure you’re not tagging "ca$h", "<^^", or "Qeyso" as inappropriate.
 * Also be careful that for 'qey' you flag it regardless of case - it’s bad in upper or lower case.
 *
 * Your output should either be "CLEAN" if the message board post is appropriate. If at least one Martian swear word is
 * detected the output should say "BAD", then the username of the poster, and the number of times they used each bad
 * word. Please refer to the sample runs below for formatting of the input and output.
 *
 * BAD Username <^^: qey: $: Sample Run 1
 *
 * Enter message board post:
 *
 * Alien25 - ojag qey afoh aoh foghg ^^ ljjls ^^ lsjflsfj!
 *
 * Results:
 *
 * BAD Alien25 ^^: 2 qey: 1 $: 0 Sample Run 2
 *
 * Enter message board post:
 *
 * Martian3 - af;$iaef  a;ofijad;ofa a^^piag;o oifoehg ^^^
 *
 * Results:
 *
 * CLEAN Sample Run 3
 *
 * Enter message board post:
 *
 * B0rg - resistance is futile QeY hahahaha $$$  ^^
 *
 * Results:
 *
 * BAD B0rg ^^: 1 qey: 1 $: 0
 */

public class Assignment4 {
}
