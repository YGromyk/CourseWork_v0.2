//
// Created by Gromyk Juriy on 10/19/2017.
//

#ifndef COURSESTART_TESTREADER_H
#define COURSESTART_TESTREADER_H

#include <fstream>
#include "Question.h"
#include <list>
class TestReader {
private:
    auto FileSource();
    list<Question> testBase;
public:
    TestReader();

};


#endif //COURSESTART_TESTREADER_H
