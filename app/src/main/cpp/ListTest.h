//
// Created by Gromyk Juriy on 10/20/2017.
//

#ifndef COURSESTART_LISTTEST_H
#define COURSESTART_LISTTEST_H

#include "Question.h"
#include <list>
#include <jni.h>
class ListTest {
private:
    list<Question> base;
public:
    ListTest(){
    }

    list<Question> CreateList(){
        base.push_back(Question("action","дія, вчинок"));
        base.push_back(Question("activity","діяльність"));
        base.push_back(Question("adverb","прислівник"));
        base.push_back(Question("allow","дозволяти"));
        base.push_back(Question("brave","сміливий"));
        base.push_back(Question("bottle","пляшка"));
        base.push_back(Question("beard","борода"));
        base.push_back(Question("awful","жахливий"));
        base.push_back(Question("catch","зловити, впіймати"));
        base.push_back(Question("carol","різдв’яна пісня"));
        base.push_back(Question("composer","композитор"));
        base.push_back(Question("climate","клімат"));
        base.push_back(Question("compare","порівнювати"));
        base.push_back(Question("connect","з’єднувати"));
        base.push_back(Question("close","закривати"));
        base.push_back(Question("cheap","дешевий"));
        base.push_back(Question("come","приходити"));
        base.push_back(Question("braid","косічки"));
        base.push_back(Question("moustache","вуса"));
        base.push_back(Question("brave","відважний"));
        base.push_back(Question("hard-working","працьовитий"));
        base.push_back(Question("naughty","неслухняний"));
        base.push_back(Question("rude","грубіян"));
        base.push_back(Question("skinny","дуже худий"));
        base.push_back(Question("slim","стрункий"));
        base.push_back(Question("weak","млявий"));
        base.push_back(Question("earring","сережка"));
        base.push_back(Question("ponytail","хвостик( з волосся)"));
        base.push_back(Question("plump","товстий"));
        base.push_back(Question("selfish","егоїстичний"));
        base.push_back(Question("serious","серйозний"));
        base.push_back(Question("shy","скромний"));
        base.push_back(Question("spaceman","космонавт"));
        base.push_back(Question("scientist","науковець"));
        base.push_back(Question("writer","письменник"));
        base.push_back(Question("waitress","офіціантка"));
        base.push_back(Question("doctor","лікар"));
        base.push_back(Question("air hostess","стюардеса"));
        base.push_back(Question("seller","продавець"));
        base.push_back(Question("businessman","підприємець"));
        base.push_back(Question("artist","художник"));
        base.push_back(Question("computer programmer","програміст"));
        base.push_back(Question("travel agent","туроператор"));
        base.push_back(Question("pasta","макарони"));
        base.push_back(Question("pizza","піца"));
        base.push_back(Question("sausage","ковбаса"));
        base.push_back(Question("omelette","омлет"));
        base.push_back(Question("hot dog","хот-дог"));
        base.push_back(Question("soup","суп"));
        base.push_back(Question("salad","салат"));
        base.push_back(Question("milkshake","молочний коктейль"));
        base.push_back(Question("tea","чай"));
        base.push_back(Question("chicken","курча"));
        base.push_back(Question("apple pie","яблучний пиріг"));
        base.push_back(Question("fried bacon","смажений бекон"));
        base.push_back(Question("french fries","картопля фрі"));



        return base;
    }
};


#endif //COURSESTART_LISTTEST_H
