
import React from 'react';
import * as firebase from 'firebase'
import { StyleSheet, Text, View ,YellowBox} from 'react-native';
const firebaseConfig = {
  apiKey: "AIzaSyAj9LteXiPapKYVAdK63C8-9VfNUFxJXzA",
  authDomain: "teaestate-ff144.firebaseapp.com",
  projectId: "teaestate-ff144",
  storageBucket: "teaestate-ff144.appspot.com",
  messagingSenderId: "695843781066",
  appId: "1:695843781066:web:4391669415aaa2ee41f733",
  measurementId: "G-HXM5M7H135"
};
if(firebase.apps.length==0){
  firebase.initializeApp(firebaseConfig)
}
YellowBox.ignoreWarnings(['Setting a timer for a longer period of time'])
import Providers from './navigation/index';
export default function App() {
  return <Providers/>
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
