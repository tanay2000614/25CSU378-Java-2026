public class StringBuilderToolkit 
{
    static String reverse(String text)
    {
        if(text == null)
        {
            System.out.println("Invalid text cannot reverse");
            return null;
        }
        return new StringBuilder(text).reverse().toString();
    }

    static String repeat(String text, int count)
    {
        if(text == null || count < 0)
        {
            System.out.println("Invalid text or count cannot repeat");
            return null;
        }
        return text.repeat(count);
    }

    static String joinWords(String[] words, String separator)
    {
        if(words == null || separator == null)
        {
            System.out.println("Invalid words or separator cannot join");
            return null;
        }
        return String.join(separator, words);
    }

    static String removeCharacterAt(String text, int index)
    {
        if(text == null || index < 0 || index >= text.length())
        {
            System.out.println("Invalid text or index cannot remove");
            return text;
        }
        return text.substring(0, index) + text.substring(index + 1);
    }

    static String replaceCharacterAt(String text, int index, char replacement)
    {
        if(text == null || index < 0 || index >= text.length())
        {
            System.out.println("Invalid text or index cannot replace");
            return text;
        }
        return text.substring(0, index) + replacement + text.substring(index + 1);
    }

    static String buildNumberedList(String[] items)
    {
        if(items == null)
        {
            System.out.println("Invalid items cannot build list");
            return null;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < items.length; i++)
        {
            builder.append(i + 1).append(". ").append(items[i]);
            if(i < items.length - 1)
            {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}