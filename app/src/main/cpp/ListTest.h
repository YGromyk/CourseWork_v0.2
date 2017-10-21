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
    map<string, string> base;
public:
    ListTest(){
    }

    map<string, string> CreateList(){
        base.insert(pair<string,string>("action","дія, вчинок"));
        base.insert(pair<string,string>("activity","діяльність"));
        base.insert(pair<string,string>("adverb","прислівник"));
        base.insert(pair<string,string>("allow","дозволяти"));
        base.insert(pair<string,string>("brave","сміливий"));
        base.insert(pair<string,string>("bottle","пляшка"));
        base.insert(pair<string,string>("beard","борода"));
        base.insert(pair<string,string>("awful","жахливий"));
        base.insert(pair<string,string>("catch","зловити, впіймати"));
        base.insert(pair<string,string>("carol","різдв’яна пісня"));
        base.insert(pair<string,string>("composer","композитор"));
        base.insert(pair<string,string>("climate","клімат"));
        base.insert(pair<string,string>("compare","порівнювати"));
        base.insert(pair<string,string>("connect","з’єднувати"));
        base.insert(pair<string,string>("close","закривати"));
        base.insert(pair<string,string>("cheap","дешевий"));
        base.insert(pair<string,string>("come","приходити"));
        base.insert(pair<string,string>("braid","косічки"));
        base.insert(pair<string,string>("moustache","вуса"));
        base.insert(pair<string,string>("brave","відважний"));
        base.insert(pair<string,string>("hard-working","працьовитий"));
        base.insert(pair<string,string>("naughty","неслухняний"));
        base.insert(pair<string,string>("rude","грубіян"));
        base.insert(pair<string,string>("skinny","дуже худий"));
        base.insert(pair<string,string>("slim","стрункий"));
        base.insert(pair<string,string>("weak","млявий"));
        base.insert(pair<string,string>("earring","сережка"));
        base.insert(pair<string,string>("ponytail","хвостик( з волосся)"));
        base.insert(pair<string,string>("plump","товстий"));
        base.insert(pair<string,string>("selfish","егоїстичний"));
        base.insert(pair<string,string>("serious","серйозний"));
        base.insert(pair<string,string>("shy","скромний"));
        base.insert(pair<string,string>("spaceman","космонавт"));
        base.insert(pair<string,string>("scientist","науковець"));
        base.insert(pair<string,string>("writer","письменник"));
        base.insert(pair<string,string>("waitress","офіціантка"));
        base.insert(pair<string,string>("doctor","лікар"));
        base.insert(pair<string,string>("air hostess","стюардеса"));
        base.insert(pair<string,string>("seller","продавець"));
        base.insert(pair<string,string>("businessman","підприємець"));
        base.insert(pair<string,string>("artist","художник"));
        base.insert(pair<string,string>("computer programmer","програміст"));
        base.insert(pair<string,string>("travel agent","туроператор"));
        base.insert(pair<string,string>("pasta","макарони"));
        base.insert(pair<string,string>("pizza","піца"));
        base.insert(pair<string,string>("sausage","ковбаса"));
        base.insert(pair<string,string>("omelette","омлет"));
        base.insert(pair<string,string>("hot dog","хот-дог"));
        base.insert(pair<string,string>("soup","суп"));
        base.insert(pair<string,string>("salad","салат"));
        base.insert(pair<string,string>("milkshake","молочний коктейль"));
        base.insert(pair<string,string>("tea","чай"));
        base.insert(pair<string,string>("chicken","курча"));
        base.insert(pair<string,string>("apple pie","яблучний пиріг"));
        base.insert(pair<string,string>("fried bacon","смажений бекон"));
        base.insert(pair<string,string>("french fries","картопля фрі"));



        return base;
    }
};


#endif //COURSESTART_LISTTEST_H
