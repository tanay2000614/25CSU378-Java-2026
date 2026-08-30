public class StringFundamentals 
{
    static boolean hasText(String value)
    {
        return value != null && !value.trim().isEmpty();
    }

    static String normalizeCourseCode(String code)
    {
        if(!hasText(code))
        {
            System.out.println("Invalid code cannot normalize");
            return null;
        }
        return code.trim().toUpperCase();
    }

    static int countOccurrences(String text, char target)
    {
        if(text == null)
        {
            System.out.println("Invalid text cannot count");
            return 0;
        }

        int count = 0;
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == target)
                count++;
        }
        return count;
    }

    static int lengthOfLastWord(String text)
    {
        if(text == null)
        {
            System.out.println("Invalid text");
            return 0;
        }

        String trimmed = text.trim();
        if(trimmed.isEmpty())
            return 0;

        int lastSpace = trimmed.lastIndexOf(' ');
        return trimmed.length() - lastSpace - 1;
    }

    static void reverseString(char[] characters)
    {
        if(characters == null)
        {
            System.out.println("Invalid array cannot reverse");
            return;
        }

        String reversed = new StringBuilder(new String(characters)).reverse().toString();
        for(int i = 0; i < characters.length; i++)
        {
            characters[i] = reversed.charAt(i);
        }
    }
}