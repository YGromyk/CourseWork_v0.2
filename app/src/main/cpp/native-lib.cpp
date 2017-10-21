#include <jni.h>
#include <string>
#include "ListTest.cpp"
#include "Question.cpp"
extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_gromykjuriy_coursework_1v02_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}


extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_example_gromykjuriy_coursework_1v02_MainActivity_getListBase(JNIEnv *env, jstring jStr ){
    jobjectArray retArr;
    ListTest base;
    unsigned long int n = base.CreateList().size() * 2;
    map<string, string> tempList = base.CreateList();
    map<string, string>::iterator iter = tempList.begin();
    char* quest[n];
    for(int i = 0; i < n; i++, iter++){
        quest[i] = (char*)iter->first.c_str();
        i++;
        quest[i] =(char*)iter->second.c_str();
    }
    retArr = (jobjectArray)env->NewObjectArray(n,
                                               env->FindClass("java/lang/String"),
                                               env->NewStringUTF(""));
    for(int i = 0;i < n;i++) {
        env->SetObjectArrayElement(
                retArr,i,env->NewStringUTF(quest[i]));
    }
    return retArr;
}


extern "C"
JNIEXPORT jobjectArray JNICALL
Java_com_example_gromykjuriy_coursework_1v02_MainActivity_func(JNIEnv *env, jobject) {
    Question q("lol", "кек");
    Question question1("laptop", "ноутбук");
    Question question2("smartphone", "смартфон");
    jobjectArray retArr;

    char* quest[6] = { (char*)&q.getQuestion().begin()->first[0u],
                       &q.getQuestion().begin()->second[0u],
                       (char*)&question1.getQuestion().begin()->first[0u],
                       &question1.getQuestion().begin()->second[0u],
                       (char*)&question2.getQuestion().begin()->first[0u],
                       &question2.getQuestion().begin()->second[0u]};
    retArr = (jobjectArray)env->NewObjectArray(6,
                                               env->FindClass("java/lang/String"),
                                               env->NewStringUTF(""));

    for(int i = 0;i < 6;i++) {
        env->SetObjectArrayElement(
                retArr,i,env->NewStringUTF(quest[i]));
    }
    return retArr;
}
