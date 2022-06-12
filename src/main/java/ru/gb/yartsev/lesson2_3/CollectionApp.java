package ru.gb.yartsev.lesson2_3;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {

        final String[] myArrayWords = """
                I heard Pat, Lucy’s carer, knock on Lucy’s bedroom door, and then a slight creak 
                as the door opened, followed by: 
                - Your new carer, Cathy, is on the phone for you. Can you come and talk to her?
                There was silence and then I heard the bedroom door close. A few moments later Pat’s voice came on 
                the phone again. 
                - I told her, but she’s still refusing to even look at me. She’s just sitting there 
                on the bed staring into space.
                My worries for Lucy rose.
                - What should I do now? - Pat asked, anxiously. - Shall I ask my husband to talk to her?
                - Does Lucy have a better relationship with him? - I asked.
                - No, not really, - Pat said. - She won’t speak to him, either. We might have to leave her here until 
                Monday, when her social worker is back at work.
                - Then Lucy will have the whole weekend to brood over this, - I said. - It will be worse. Let’s try 
                again to get her to the phone. I’m sure it will help if she hears I’m not an ogre.
                Pat gave a little snort of laughter. 
                - Jill said you were very good with older children, - referring to my support social worker.
                - That was sweet of her, - I said. - Now, is your phone fixed or cordless?
                - Cordless.
                - Excellent. Take the handset up with you, knock on Lucy’s bedroom door, go in and tell her again 
                I would like to talk to her, please. But this time, leave the phone on her bed facing up, so she can 
                hear me, and then come out. I might end up talking to myself, but I’m used to that.
                Pat gave another snort of nervous laughter. 
                - Fingers crossed, - she said.
                I heard Pat’s footsteps going up the stairs again, followed by the knock on Lucy’s bedroom door and 
                the slight creak as it opened. Pat’s voice trembled a little as she said: 
                - Cathy’s still on the phone and she’d like to talk to you.
                There was a little muffled sound, presumably as Pat put the phone on Lucy’s bed, and then I heard 
                the bedroom door close. I was alone with Lucy.
                Lucy and I believe we were destined to be mother and daughter; it just took us a while to find each 
                other. Lucy was eleven years old when she came to me. I desperately wish it could have been sooner. 
                It breaks my heart when I think of what happened to her, as I’m sure it will break yours. 
                To tell Lucy’s story – our story – properly, we need to go back to when she was a baby, before I 
                knew her. With the help of records we’ve been able to piece together Lucy’s early life, so here is 
                her story, right from the start...
                """.toLowerCase().split("[\\p{Space}\\p{Punct}\\p{Pd}]+");

        final List<String> wordList = Arrays.asList(myArrayWords);
        final Set<String> uniqueWords = new HashSet<>(wordList);
        System.out.println();
        System.out.println("Список уникальных слов: ");
        for (String s : uniqueWords) {
            System.out.println(s);
        };

        final Map<String, Integer> map = new HashMap<>((int) (wordList.size() * 1.25));
        for (String s : wordList) {
            map.merge(s, 1, Integer::sum);
        }
        System.out.println();
        map.forEach((K, V) -> System.out.println("Слово \"" + K + "\" встречается " + V + " раз"));
    }
}

