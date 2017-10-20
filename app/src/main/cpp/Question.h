//
// Created by Gromyk Juriy on 10/20/2017.
//
#include <string>
#include <jni.h>
#include <map>
#ifndef COURSESTART_QUESTION_H
#define COURSESTART_QUESTION_H

using namespace std;

extern "C"
class Question {
private:
    string question;
    string answer;
    string separator = "############";
public:
    Question(string _question, string _answer);
    map<string, string> getQuestion();
    string getAsk();
    string getAnswer();
    friend  fstream& operator>>(fstream& stream, Question &_question);

};


#endif //COURSESTART_QUESTION_H
